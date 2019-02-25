 

import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   private String title;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo( String title )
      {
       for(int i=0; i<downloadList.size(); i++)
       {
           if(downloadList.get(i).getTitle()==title)
           {
               return downloadList.get(i);
           }
       }
       return null;
      } // end method getDownloadInfo
      
   public void updateDownloads( List<String> titles )
      {
          for(int i = 0; i<titles.size(); i++)
          {
              String currTitle=titles.get(i);
              if(getDownloadInfo(currTitle)!=null)
              {
                  getDownloadInfo(currTitle).incrementTimesDownloaded();
              }
              else
              {
                  downloadList.add(new DownloadInfo(currTitle));
              }
              
          }
      } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads