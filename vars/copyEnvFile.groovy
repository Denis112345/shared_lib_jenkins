def call(String credentialsId, String variableName, String targetPath) {
    ansiColor('xterm') {
        echo colorsLog.info("--- Начало копирования ENV файла ---")

        withCredentials([file(credentialsId: credentialsId, variable: variableName)]) {
            sh """
                ABS_PATH="\$(cd "\$(dirname "${targetPath}")" && pwd)/\$(basename "${targetPath}")"
                cat "\$${variableName}" | tee "\${ABS_PATH}" > /dev/null
                chmod 600 "\${ABS_PATH}"
                echo "✅ Файл записан: \${ABS_PATH}"
            """
        }
        echo colorsLog.success("--- Копирования ENV файла успешно завершено ---")
    }
}