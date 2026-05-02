def call(String credentialsId, String variableName, String pathFromCopy) {
    ansiColor('xterm') {
        echo colors.info("--- Начало копирования ENV файла ---") \

        withCredentials([file(credentialsId: credentialsId, variable: variableName)]) {
            sh "cp ${env[variableName]} ${pathFromCopy}"
        }
        echo colors.success("--- Копирования ENV файла успешно завершено ---") \
    }
}