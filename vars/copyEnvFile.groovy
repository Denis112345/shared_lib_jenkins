def call(Streing credentialsId, String variable_name, String path_from_copy) {
    echo "--- Начало копирования ENV файла ---"
    withCredentials([file(credentialsId: "${credentialsId}", variable: "${variable_name}")]) {
        sh "cp \$variable_name \$path_from_copy"
    }
    echo "--- Копирования ENV файла успешно завершено ---"
}