def call(String filePath) {
    def content = libraryResource(filePath)
    ansiColor('xterm') {
        echo colorsLog.success(" Файл: ${filePath}")
        echo "──────────────────────────────"
        echo content
        echo "──────────────────────────────"
    }
}