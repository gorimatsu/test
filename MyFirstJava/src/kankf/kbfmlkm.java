package kankf;

import java.util.Scanner;

public class kbfmlkm {

	public static void main(String[] args) {
		
		System.out.println("要素数　; ");
		Scanner sc =new Scanner(System.in);//KB入力
		int n = sc.nextInt(); //配列の要素数
		int[] a = new int[n]; //要素数nの配列
				
		//配列の作成
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i +"]=");
			a[i] = sc.nextInt();
			
		}
		
		//検索地の取得
		System.out.println("探す値　:　");
		int key = sc.nextInt();
		System.out.println("key = "+key);//テスト用
		
		
		//検索処理
		int i;
		for (i = 0; i < a.length; i++) {
			if(a[i] == key){
				break;
			}
			
			
		}
		//結果の出力
		if (i<n) {
			System.out.println("その値は a[" + i +]"にあります。);
		} else {
			System.out.println("その値はありません。");

		}
	}
}
