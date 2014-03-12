package me.MinerX;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class ResourceLoader
{
	public static Icon Iconload(String path)
	{
		Icon icon = new ImageIcon(ResourceLoader.class.getResource(path));

		return icon;
	}

	public static ImageIcon ImageIconLoad(String path)
	{
		ImageIcon imageicon = new ImageIcon(ResourceLoader.class.getResource(path));
		return imageicon;
	}

	public static Image ImageLoad(String path)
	{
		Image image = new ImageIcon(ResourceLoader.class.getResource(path)).getImage();
		return image;
	}

	public static Image loadstring(String path)
	{
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(ResourceLoader.class.getResource(path));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return image;
	}

	public static BufferedImage loadBufferedImage(String path)
	{
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(ResourceLoader.class.getResource(path));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return image;
	}

	public static AudioInputStream LoadSound(String path)
	{
		AudioInputStream x = null;
		try
		{
			x = AudioSystem.getAudioInputStream(
					ResourceLoader.class.getResource("/" + path));
		}
		catch (UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return x;
	}
}
