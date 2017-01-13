/*** Predications
 * メソッドもしくはコンストラクタを助けるスタティックコンビニエンスメソッドはそれが適切に処理されたかどうか確認する（その*前提条件*が合わせられるかどうか）。
 * これらのメソッドはtrue（もしくはcheckNotNull、non-nullを期待したオブジェクトリファレンス）を期待してboolean表現を一般的には採用する。false（もしくはnull）
 * が代わりに渡されたとき、メソッドを呼ぶためにはその呼び主が間違いを作るその呼び主と疎通をして助けるPreconditionメソッドは例外を確認せずに投げる。
 * 
 * パフォーマンスに関する注意：
 * このクラスの目的はコードを読みやすさを上げるためのもので、いくつかの状況は重大なパフォーマンスコストになるかもしれない。
 * メッセージ構造によるパラメータ値ということを思い出してはしきりにすべて計算させるべきで、オートボクシングと可変引数配列の作成はその上起こり、さらに
 * 前提条件は成功（それが前提条件でほとんどいつもするべきこととして）したときに確認する。幾つかの状況でこれらの無駄なCPUサイクルや割り当てが実際の問題
 * まで追加できる。パフォーマンスセンシティブ前提条件チェックはいつも慣用形式に変換させることができる
 */

package com.test.google.common.base;

import com.google.common.base.Preconditions;

public class CheckNotNullTest {

	public static void main(String[] args) {
		String string = null;
		
		//if(string == null){
			//throw new NullPointerException();
		//}
		
		Preconditions.checkNotNull(string);
	}
}
