def call(){
    def tag = sh script: 'git init && git rev-parse HEAD', returnStdout: true
    return tag
}
