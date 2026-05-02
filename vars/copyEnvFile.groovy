def call(String credentialsId, String variableName, String pathFromCopy) {
    echo "--- Начало копирования ENV файла ---"
    withCredentials([file(credentialsId: credentialsId, variable: variableName)]) {
        sh "cp ${env[variableName]} ${pathFromCopy}"
    }
    echo "--- Копирования ENV файла успешно завершено ---"
}