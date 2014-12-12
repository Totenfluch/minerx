package me.MinerX;

import java.util.HashMap;


public class Specs
{
	public static HashMap<String, String> AMDNeo;
	public static HashMap<String, String> NVIDIANeo;


	public static void initSpecs()
	{
		//Some configs picked from hw.neoscrypt.tk/index.php
		AMDNeo = new HashMap<String, String>();
		NVIDIANeo = new HashMap<String, String>();
		
		AMDNeo.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80");
		AMDNeo.put("AMD Radeon HD 5670", "-I 14 -w 32");
		AMDNeo.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5770", "-I 17");
		AMDNeo.put("AMD Radeon HD 5830", "-I 18");
		AMDNeo.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 6320", "-I 9");
		AMDNeo.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
		AMDNeo.put("AMD Radeon HD 6570", "-I 10 -w 64 --shaders 480 --gpu-memclock 900 --gpu-engine 800");
		AMDNeo.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 32");
		AMDNeo.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 48");
		AMDNeo.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 48");
		AMDNeo.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 48");
		AMDNeo.put("AMD Radeon HD 6850", "-I 14 -g 2 -w 48");
		AMDNeo.put("AMD Radeon HD 6870", "-I 14 --gpu-memclock 760 --gpu-engine 850");
		AMDNeo.put("AMD Radeon HD 6930", "-I 14 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 6950", "-I 14 -g 1 -w 256 -l 1");
		AMDNeo.put("AMD Radeon HD 6970", "-I 14 -w 32");
		AMDNeo.put("AMD Radeon HD 7750", "-I 14 --gpu-memclock 760 --gpu-engine 850");
		AMDNeo.put("AMD Radeon HD 7770", "-I 14 -w 32 -g 1");
		AMDNeo.put("AMD Radeon HD 7790", "-I 14 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 7850", "-I 13 -w 32");
		AMDNeo.put("AMD Radeon HD 7870", "-I 14 -w 32");
		AMDNeo.put("AMD Radeon HD 7950", "-rI 4584 -w 64");
		AMDNeo.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 48 --gpu-memclock 1250 --gpu-engine 1025");
		AMDNeo.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 48");
		AMDNeo.put("AMD Radeon R9 270", "-I 13 -w 16 --gpu-memclock 1500 --gpu-engine 1125");
		AMDNeo.put("AMD Radeon R9 270x", "-w 16 -I 13 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125");		
		AMDNeo.put("AMD Radeon R9 280x", "-g 2 -w 256 -xintensity 3 --thread-concurrency 8192 --gpu-engine 1000 --gpu-memclock 1500");
		AMDNeo.put("AMD Radeon R9 290", "-g 2 -w 256 -xintensity 3 --thread-concurrency 8192 --gpu-engine 1000 --gpu-memclock 1500");
		AMDNeo.put("AMD Radeon R9 290x", "-g 2 -w 256 -xintensity 3 --thread-concurrency 8192 --gpu-engine 1000 --gpu-memclock 1500");
		
		NVIDIANeo.put("NVIDIA GeForce GTX 760","-I 13 -w 128");
		NVIDIANeo.put("NVIDIA GeForce GTX 780 Ti","-I 13 -w 128");
		NVIDIANeo.put("NVIDIA GeForce 8800 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce 9600 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce 9800 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 260","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 440","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 520","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 640","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 260","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 275","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTS 450","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 460","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 470","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 480","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 555","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 560","-I 13 --worksize 64 -g 1");
		NVIDIANeo.put("NVIDIA GeForce GTX 550 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 560 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 570","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 580","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 590","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GT 640","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 650","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 650 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 660","-w 16 -I 14");
		NVIDIANeo.put("NVIDIA GeForce GTX 660 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 670","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 680","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 770","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 750 Ti","-w 128 -l 15 -g 1 -I 17");
		NVIDIANeo.put("NVIDIA Geforce GTX 770","-I 18 -w 128 -g 1");
		NVIDIANeo.put("NVIDIA GeForce GTX TITAN","-w 128 -I 14");
	}
}
