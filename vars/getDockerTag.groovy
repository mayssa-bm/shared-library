def call(){
    def tag = sh script: 'git ls-remote https://github.com/mayssa-bm/k8s-CICD.git refs/heads/master', returnStdout: true
    return tag
}
