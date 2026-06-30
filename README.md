# webapp00

授業演習用の JSP/Servlet テンプレートプロジェクトです。

## 概要
このリポジトリは、以下を使った Java Web アプリ学習用のスターターテンプレートです。
- Java Servlet
- JSP
- Maven

## プロジェクト構成
- src/main/java: Java ソースコード
- src/main/webapp: JSP と WEB-INF リソース
- pom.xml: Maven のビルド設定

## ビルド方法
1. Java と Maven がインストールされていることを確認します。
2. 次のコマンドを実行します。

```bash
mvn clean package
```

ビルド成果物は `target/` 配下に生成されます。

## 授業で使うときの注意
- パッケージ名やクラス名は課題の指示に合わせてください。
- `target/` 配下の生成物はコミットしないでください。
- 担当教員から指定がある場合は、この README を適宜更新してください。

## ライセンス
本テンプレートは教育目的での利用を想定しています。
