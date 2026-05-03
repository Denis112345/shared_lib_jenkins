def call(String credentialsId, String variableName, String pathFromCopy) {
    ansiColor('xterm') {
        echo colorsLog.info("--- Начало копирования ENV файла ---")

        withCredentials([file(credentialsId: credentialsId, variable: variableName)]) {
            sh '''
                echo "🔍 Source var name: ''' + variableName + '''"
                echo "🔍 Source path: $''' + variableName + '''"
                echo "🔍 Target path: ${pathFromCopy}"
                ls -la "$''' + variableName + '''" || echo "❌ Source file not found!"
                cp -v "$''' + variableName + '''" "${pathFromCopy}"
            '''
        }
        echo colorsLog.success("--- Копирования ENV файла успешно завершено ---")
    }
}