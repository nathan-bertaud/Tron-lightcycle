/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tronv2.View;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author paul
 */
public class MusicPlayer 
{
    InputStream theMusic;
    AudioStream audio;
    public MusicPlayer(String itsFilePath) throws FileNotFoundException, IOException
    {
       theMusic = new FileInputStream(new File(itsFilePath));
       audio = new AudioStream(theMusic); 
    }
    public Boolean playMusic()
    {
        Boolean theTrue =false ;
        try
        {   
            AudioPlayer.player.start(audio);
            theTrue = true;
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return theTrue;
    }
    public Boolean stopMusic()
    {
        Boolean theTrue =true ;
        try
        {
            AudioPlayer.player.stop(audio);
            theTrue= false;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return theTrue;
    }
    
}
