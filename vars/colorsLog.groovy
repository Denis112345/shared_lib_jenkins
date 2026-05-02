def call(String text, String colorCode = '0') {
    return "\u001b[${colorCode}m${text}\u001b[0m"
}

def error(String text) { call(text, '31') }
def success(String text) { call(text, '32') }
def warning(String text) { call(text, '33') }
def info(String text) { call(text, '36') }