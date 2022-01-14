package com.study.ocp.day02;

/*
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
*/
public class Homework {

	public static void main(String[] args) {
        int[] cm = new int[] {172, 168, 164, 170, 176};
        int[] kg = new int[] {62, 57, 58, 64, 64};
		
        System.out.println(Arrays.toString(cm));
        System.out.println(Arrays.toString(kg));
    // 總和
		int sum1 = 0;
		for(int i=0;i<cm.length;i++) {
			sum1 += cm[i];}
		System.out.printf("總和: %d\n", sum1);
		int sum2 = 0;
		for(int ii=0;ii<kg.length;ii++) {
			sum2 += kg[ii];}
		System.out.printf("總和: %d\n", sum2);
// 平均
		double avg1 = (double)sum1 / cm.length;
		System.out.printf("平均: %.1f\n", avg1);
        double avg2 = (double)sum2 / kg.length;
		System.out.printf("平均: %.1f\n", avg2);
// 平方和累加
		double asum1 = 0;
		for(int i=0;i<cm.length;i++) {
			asum1 += Math.pow(cm[i]-avg1, 2);
		}
		System.out.printf("平方和累加: %.1f\n", asum1);
                double asum2 = 0;
		for(int ii=0;ii<kg.length;ii++) {
			asum2 += Math.pow(kg[ii]-avg2, 2);
		}
		System.out.printf("平方和累加: %.1f\n", asum2);
// sd 標準差
		double sd1 = Math.sqrt(asum1/cm.length);
		System.out.printf("標準差: %.1f\n", sd1);

		double sd2 = Math.sqrt(asum2/kg.length);
		System.out.printf("標準差: %.1f\n", sd2);

	}

}
