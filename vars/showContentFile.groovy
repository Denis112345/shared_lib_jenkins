def call(String filePath) {
    def content = libraryResources(filePath)
    ansiColor('xterm') {
        echo colorsLog.success(" Файл: ${filePath}")
        echo "──────────────────────────────"
        echo content
        echo "──────────────────────────────"
    }
}