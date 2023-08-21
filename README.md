# kotolin-cli


## ビルド方法

kotlincコマンドを使用して、Kotlinコードをコンパイルし、実行可能なJARファイルを作成します。

`kotlinc <filename>.kt -include-runtime -d <filename>.jar`

## loganalyzer

実行：<br>
java -jar loganalyzer.jar ./logfile.log ERROR
<br>
./logfile.logにあるログファイルでERRORという文字列を検索します。
<br>

## calculator

実行：<br>
java -jar calculator.jar
<br>
実行後、プロンプトが表示されるので、算数式を入力します (例: 1 + 1).
上記の指示に従って、エラーハンドリング機能が付加され、CLIツールとして使用可能な状態になります。
<br>

## webcrawler

実行：<br>
java -jar webcrawler.jar https://www.example.com
<br>
<br>

## filebackup

実行：<br>
java -jar filebackup.jar ./file.txt path/to/destination/file_backup.txt
<br>
<br>

## weathertool

実行：<br>
java -jar WeatherTool.jar Tokyo YOUR_OPENWEATHERMAP_API_KEY
<br>
<br>


