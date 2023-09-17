import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class RS2ClientLoader extends Applet {

    private static final long serialVersionUID = 1L;

    public static boolean rs = false;

    public static Properties aProperties1 = new Properties();
    public JFrame aJFrame2;
    public JPanel aJPanel3 = new JPanel();

    public static void main(String[] arg0) {
    	RS2ClientLoader l = new RS2ClientLoader();
        l.doFrame();
    }

    @Override
    public void init() {
        doApplet();
    }

    void doApplet() {
        setParms();
        startClient();
    }

    public void doFrame() {
        setParms();
        openFrame();
        startClient();
    }

    private void setParms() {
    	aProperties1.put("cabbase", "ziotic.cab");
    	aProperties1.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
    	aProperties1.put("colourid", "0");
    	aProperties1.put("worldid", "1");
    	aProperties1.put("lobbyid", "3594");
    	aProperties1.put("lobbyaddress", rs ? "lobby17.runescape.com" : "127.0.0.1");
    	aProperties1.put("demoid", "0");
        aProperties1.put("demoaddress", "");
        aProperties1.put("modewhere", "1");
        aProperties1.put("modewhat", "0");
        aProperties1.put("lang", "0");
        aProperties1.put("objecttag", "0");
        aProperties1.put("js", "1");
        aProperties1.put("game", "0");
        aProperties1.put("affid", "0");
        aProperties1.put("advert", "1");
        aProperties1.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
        aProperties1.put("country", "0");
        aProperties1.put("haveie6", "0");
        aProperties1.put("havefirefox", "1");
        aProperties1.put("cookieprefix", "");
        aProperties1.put("cookiehost", ".ziotic.com");
        aProperties1.put("cachesubdirid", "0");
        aProperties1.put("crashurl", "");
        aProperties1.put("unsignedurl", "");
        aProperties1.put("sitesettings_member", "1");
        aProperties1.put("frombilling", "false");
        aProperties1.put("sskey", "");
        aProperties1.put("force64mb", "false");
        aProperties1.put("worldflags", "8");
    }

    void openFrame() {
        aJFrame2 = new JFrame("Runescape");
        aJFrame2.setLayout(new BorderLayout());
        aJPanel3.setLayout(new BorderLayout());
        aJPanel3.add(this);
        aJPanel3.setPreferredSize(new Dimension(765, 503));
        aJFrame2.getContentPane().add(aJPanel3, "Center");
        aJFrame2.pack();
        aJFrame2.setVisible(true);
        aJFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void startClient() {
        try {
            Applet_Sub1.provideLoaderApplet(this);
            client var_client = new client();
            var_client.init();
            var_client.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*private void startClient() {
        try {

            Applet_Sub1.provideLoaderApplet(this);
            client var_client = new client();
            var_client.init();
            var_client.start();
            var_client.setStub(this);
            this.add(var_client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    @Override
    public String getParameter(String arg0) {
        return (String) aProperties1.get(arg0);
    }

    @Override
    public URL getDocumentBase() {
        try {
            return new URL("http://127.0.0.1");
        } catch (MalformedURLException e) {
        }
        return null;
    }

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://127.0.0.1");
        } catch (MalformedURLException e) {
        }
        return null;
    }
}