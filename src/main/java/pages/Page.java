package pages;

import core.utils.ConfigUtil;
import pages.android.*;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");

    FlickrLoginPage flickrLoginPage = new FlickrLoginPage(this);
    protected  FlickrLoginPage getFlickrLoginPage(){return flickrLoginPage;}

    SignUpPage signUpPage = new SignUpPage(this);
    protected SignUpPage getSignUpPage(){return signUpPage;}

    SharePage sharePage = new SharePage(this);
    protected SharePage getSharePage(){return sharePage;}

    Personalinfo personalinfo = new Personalinfo(this);
    protected Personalinfo getPersonalinfo(){return personalinfo;}

    TrackViews trackViews = new TrackViews(this);
    protected TrackViews getTrackViews(){return trackViews;}

    AlbumPage albumPage = new AlbumPage(this);
    protected AlbumPage getAlbumPage(){return albumPage;}

    PostPublicPage postPublicPage = new PostPublicPage(this);
    protected PostPublicPage getPostPublicPage(){return postPublicPage;}

    GroupPage groupPage = new GroupPage(this);
    protected  GroupPage getGroupPage(){return groupPage;}

    AutoUploaderPage autoUploaderPage = new AutoUploaderPage(this);
    protected AutoUploaderPage getAutoUploaderPage(){return autoUploaderPage;}

    ManuBarPage manuBarPage = new ManuBarPage(this);
    protected ManuBarPage getManuBarPage(){return manuBarPage;}

    NotificationPage notificationPage = new NotificationPage(this);
    protected NotificationPage getNotificationPage(){return notificationPage;}

    CameraPage cameraPage = new CameraPage(this);
    protected CameraPage getCameraPage(){return cameraPage;}

    CommentPhotoPage commentPhotoPage = new CommentPhotoPage(this);
    protected CommentPhotoPage getCommentPhotoPage(){return commentPhotoPage;}

}
