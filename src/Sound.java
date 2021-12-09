import javax.swing.JOptionPane;//imports JOptionPane
import java.awt.Desktop;
import java.net.URI;

public class Sound {
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	
	
	public void music(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=KeFSggRaa0Q&t=564s"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music1(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=07SctM9E_OI"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music2(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=LYto1Vhkixg"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music3(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=JuYeHPFR3f0"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music4(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=QGJuMBdaqIw"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music5(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=7T2XcmEA3xc"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music6(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=w5TrJBmPKMs"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music7(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=2RRY3OVqtwc"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music8(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=_xGhK6qgPtM"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	public void music9(){
		if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=BB9myk-yZAM"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			
    		}
    	}
	}
	
}
