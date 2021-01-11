package ch14;

public class Account {
  String accountNumber;
  int balance;

  public String toString() {
    return "￥" + this.balance + "（口座番号：" + this.accountNumber + "）";
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account account = (Account)o;
      // 口座番号の両端に半角スペースが含まれていた場合削除する
      String accNum1 = this.accountNumber.trim();
      String accNum2 = account.accountNumber.trim();
      // 比較する口座番号（半角スペース抜き）が等価か
      if (accNum1.equals(accNum2)) {
        return true;
      }
    }
    return false;
  }
}
