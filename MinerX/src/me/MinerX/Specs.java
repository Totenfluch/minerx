package me.MinerX;

import java.util.HashMap;


public class Specs
{
  public static HashMap<String, String> AMD;
  public static HashMap<String, String> NVIDA;
  

public static void initSpecs()
  {
	AMD = new HashMap<String, String>();
	NVIDA = new HashMap<String, String>();
    AMD.put("AMD Radeon HD 6450", " --shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
    AMD.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125 --thread-concurrency 160000");
    AMD.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000 --gpu-memclock 1500 --gpu-engine 1125");
    AMD.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192 --gpu-engine 1050 --gpu-memclock 1500");
    AMD.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192 --gpu-memclock 1250 --gpu-engine 1025");
    AMD.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765 --gpu-memclock 1500 --gpu-engine 990");
    AMD.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035 --gpu-memclock 1250 --lookup-gap 2 --thread-concurrency 24000");
    AMD.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048 --gpu-engine 1200 --gpu-memclock 1250");
    AMD.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192");
    AMD.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
    AMD.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
    
    
    NVIDA.put("NVIDA GeForce GTX 760","-d 0 -i 0 -C 2 -l K12x18");
    NVIDA.put("NVIDA GeForce GTX 780 Ti","-l T30x16 -i 1 -m 1 -H 1");
    NVIDA.put("NVIDA GeForce 8800 GT","-H 1 (L27x3)");
    NVIDA.put("NVIDA GeForce 9600 GT","-H 1 -d 0 -i 1 -l S8x4 -C 1 -m 1");
    NVIDA.put("NVIDA GeForce 9800 GT","-l auto -d 0");
    NVIDA.put("NVIDA GeForce GTX 260","-l 54x3");
    NVIDA.put("NVIDA GeForce GT 440","-l 12x2");
    NVIDA.put("NVIDA GeForce GT 520","-C 2 -i 0");
    NVIDA.put("NVIDA GeForce GT 640","-l 82x2 -C 2 -i 0");
    NVIDA.put("NVIDA GeForce GTX 260","-l S27x3");
    NVIDA.put("NVIDA GeForce GTX 275","-i 0 -d 0");
    NVIDA.put("NVIDA GeForce GTS 450","-l F24x8 -i 0 -C 2 -H 1");
    NVIDA.put("NVIDA GeForce GTX 460","-d 0 -i 0 -l 28x8 -C 2");
    NVIDA.put("NVIDA GeForce GTX 470","-H 1 -i 0");
    NVIDA.put("NVIDA GeForce GTX 480","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
    NVIDA.put("NVIDA GeForce GTX 555","-l 12x6");
    NVIDA.put("NVIDA GeForce GTX 560","-l 14x8");
    NVIDA.put("NVIDA GeForce GTX 550 Ti","-i 1 -l F16x8");
    NVIDA.put("NVIDA GeForce GTX 560 Ti","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
    NVIDA.put("NVIDA GeForce GTX 570","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
    NVIDA.put("NVIDA GeForce GTX 580","=l 32x7");
    NVIDA.put("NVIDA GeForce GTX 590","-H 1 -d 0 -i 0 -l F16x16 -C -m 1");
    NVIDA.put("NVIDA GeForce GT 640","-i 0 -C 2 -l K41x4");
    NVIDA.put("NVIDA GeForce GTX 650","d 0 -i 0 -l K12x16 -C 1 -H 1");
    NVIDA.put("NVIDA GeForce GTX 650 Ti","-H 1 -d 0 -i 1 -l K8x16 -C 0");
    NVIDA.put("NVIDA GeForce GTX 660","-i 0 -l K10x16 -C 2 -m 1");
    NVIDA.put("NVIDA GeForce GTX 660 Ti","-C1 -1 K112x2 -i 0");
    NVIDA.put("NVIDA GeForce GTX 670","-C 2 -D -i 0 -l 56x5");
    NVIDA.put("NVIDA GeForce GTX 680","-H 1 -C 2 -m 1 -d 0 -l K16x16 -i 0");
    NVIDA.put("NVIDA GeForce GTX 770","-D -H 1 -m 1 -d 0 -i 1 -l K16x16 -C 2");
    NVIDA.put("NVIDA GeForce GTX TITAN","-d 0 -i 0 -C 2 -l K14x18");
    
    
    
  }
}
