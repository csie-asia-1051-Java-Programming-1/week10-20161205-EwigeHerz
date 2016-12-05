package ex;
import java.util.*;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn =new Scanner(System.in);
    float x =scn.nextFloat();
    if(x<=120){
    	System.out.println("夏日"+x*2.10f);
    	System.out.println("非夏日"+x*2.10f);
    }
    else if(x>120 && x<=330){
    	System.out.println("夏日"+(120*2.10f+(x-120)*3.02f));
    	System.out.println("非夏日"+(120*2.10f+(x-120)*2.68f));
    }
    else if(x>330 && x<=500){
    	System.out.println("夏日"+(120*2.10f+210*3.02f+(x-330)*4.39f));
    	System.out.println("非夏日"+(120*2.10f+210*2.68f+(x-330)*3.61f));
    }
    else if(x>500 && x<=700){
    	System.out.println("夏日"+(120*2.10f+210*3.02f+170*4.39f+(x-500)*4.97f));
    	System.out.println("非夏日"+(120*2.10f+210*2.68f+170*3.61f+(x-500)*4.01f));
    }
    else{
    	System.out.println("夏日"+(120*2.10f+210*3.02f+170*4.39f+200*4.97f+(x-700)*5.63f));
    	System.out.println("非夏日"+(120*2.10f+210*2.68f+170*3.61f+200*4.01f+(x-700)*4.50f));
    }
	}

}
