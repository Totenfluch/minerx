package me.MinerX;

import java.util.HashMap;


public class Specs
{
  public static HashMap<String, String> AMD;
  

public static void initSpecs()
  {
    AMD.put("AMD Radeon HD 6450", " --shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
    AMD.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125 --thread-concurrency 160000");
    AMD.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000 --gpu-memclock 1500 --gpu-engine 1125");
    AMD.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192 --gpu-engine 1050 --gpu-memclock 1500");
    AMD.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192 --gpu-memclock 1250 --gpu-engine 1025");
    AMD.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765 --gpu-memclock 1500 --gpu-engine 990");
    AMD.put("AMD Radeon HD 7900", " -w 256 -v 1 -I 19 -g 1 -l 1 --lookup-gap 2 --thread-concurrency 22712");
    AMD.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035 --gpu-memclock 1250 --lookup-gap 2 --thread-concurrency 24000");
    AMD.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048 --gpu-engine 1200 --gpu-memclock 1250");
    AMD.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192");
    AMD.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
    AMD.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
  }
}
