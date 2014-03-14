package me.MinerX;

import java.util.HashMap;


public class Specs
{
	public static HashMap<String, String> AMD;
	public static HashMap<String, String> NVIDIA;


	public static void initSpecs()
	{
		AMD = new HashMap<String, String>();
		NVIDIA = new HashMap<String, String>();
		AMD.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128 --thread-concurrency 2048");
		AMD.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128 --thread-concurrency 1024");
		AMD.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256 --thread-concurrency 3136");
		AMD.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80");
		AMD.put("AMD Radeon HD 5670", "-I 16 -g 2 -w 128 --thread-concurrency 3048");
		AMD.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256 --thread-concurrency 6016");
		AMD.put("AMD Radeon HD 5770", "-I 17 --thread-concurrency 7680");
		AMD.put("AMD Radeon HD 5830", "-I 18 --thread-concurrency 5600");
		AMD.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256 --thread-concurrency 5824");
		AMD.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256 --thread-concurrency 7500");
		AMD.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 6320", "-I 9");
		AMD.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
		AMD.put("AMD Radeon HD 6570", "-I 14 -g 1 --shaders 480");
		AMD.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 256 --thread-concurrency 2400");
		AMD.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 128 --thread-concurrency 5760");
		AMD.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 256 --thread-concurrency 4032");
		AMD.put("AMD Radeon HD 6850", "-I 17 -g 2 -w 256 --thread-concurrency 3840");
		AMD.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 6930", "-I 18 -g 1 -w 256 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 6950", "-I 15 -g 1 -w 256 -l 1 --thread-concurrency 6144");
		AMD.put("AMD Radeon HD 6970", "-I 19 -w 256 --shaders 1536");
		AMD.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 7770", "-I 15 --worksize 256 -g 1 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 7790", "-I 18 -g 1 -w 256 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048 --gpu-engine 1200 --gpu-memclock 1250");
		AMD.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035 --gpu-memclock 1250 --lookup-gap 2 --thread-concurrency 24000");
		AMD.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192 --gpu-memclock 1250 --gpu-engine 1025");
		AMD.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000 --gpu-memclock 1500 --gpu-engine 1125");
		AMD.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125 --thread-concurrency 160000");		
		AMD.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192 --gpu-engine 1050 --gpu-memclock 1500");
		AMD.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765 --gpu-memclock 1500 --gpu-engine 990");
		AMD.put("AMD Radeon R9 290x", "-I 20 -w 256 --thread-concurrency 32765");
		
		NVIDIA.put("NVIDIA GeForce GTX 760","-d 0 -i 0 -C 2 -l K12x18");
		NVIDIA.put("NVIDIA GeForce GTX 780 Ti","-l T30x16 -i 1 -m 1 -H 1");
		NVIDIA.put("NVIDIA GeForce 8800 GT","-H 1 (L27x3)");
		NVIDIA.put("NVIDIA GeForce 9600 GT","-H 1 -d 0 -i 1 -l S8x4 -C 1 -m 1");
		NVIDIA.put("NVIDIA GeForce 9800 GT","-l auto -d 0");
		NVIDIA.put("NVIDIA GeForce GTX 260","-l 54x3");
		NVIDIA.put("NVIDIA GeForce GT 440","-l 12x2");
		NVIDIA.put("NVIDIA GeForce GT 520","-C 2 -i 0");
		NVIDIA.put("NVIDIA GeForce GT 640","-l 82x2 -C 2 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 260","-l S27x3");
		NVIDIA.put("NVIDIA GeForce GTX 275","-i 0 -d 0");
		NVIDIA.put("NVIDIA GeForce GTS 450","-l F24x8 -i 0 -C 2 -H 1");
		NVIDIA.put("NVIDIA GeForce GTX 460","-d 0 -i 0 -l 28x8 -C 2");
		NVIDIA.put("NVIDIA GeForce GTX 470","-H 1 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 480","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 555","-l 12x6");
		NVIDIA.put("NVIDIA GeForce GTX 560","-l 14x8");
		NVIDIA.put("NVIDIA GeForce GTX 550 Ti","-i 1 -l F16x8");
		NVIDIA.put("NVIDIA GeForce GTX 560 Ti","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 570","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 580","=l 32x7");
		NVIDIA.put("NVIDIA GeForce GTX 590","-H 1 -d 0 -i 0 -l F16x16 -C -m 1");
		NVIDIA.put("NVIDIA GeForce GT 640","-i 0 -C 2 -l K41x4");
		NVIDIA.put("NVIDIA GeForce GTX 650","d 0 -i 0 -l K12x16 -C 1 -H 1");
		NVIDIA.put("NVIDIA GeForce GTX 650 Ti","-H 1 -d 0 -i 1 -l K8x16 -C 0");
		NVIDIA.put("NVIDIA GeForce GTX 660","-i 0 -l K10x16 -C 2 -m 1");
		NVIDIA.put("NVIDIA GeForce GTX 660 Ti","-C1 -1 K112x2 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 670","-C 2 -D -i 0 -l 56x5");
		NVIDIA.put("NVIDIA GeForce GTX 680","-H 1 -C 2 -m 1 -d 0 -l K16x16 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 770","-D -H 1 -m 1 -d 0 -i 1 -l K16x16 -C 2");
		NVIDIA.put("NVIDIA GeForce GTX TITAN","-d 0 -i 0 -C 2 -l K14x18");
	}
}
