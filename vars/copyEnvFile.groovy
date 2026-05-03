def call(String credentialsId, String variableName, String pathFromCopy) {
    ansiColor('xterm') {
        echo colorsLog.info("--- Начало копирования ENV файла ---") \

        withCredentials([file(credentialsId: credentialsId, variable: variableName)]) {
            sh "cp ${variableName} ${pathFromCopy}"
        }
        echo colorsLog.success("--- Копирования ENV файла успешно завершено ---") \
    }
}