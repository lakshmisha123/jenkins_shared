def call() {
    echo "✅ This is gitCheckout() from the shared library"
    checkout([$class: 'GitSCM',
               branches: [[name: "${git_branch}"]],
               userRemoteConfigs: [[credentialsId: "${git_credentails}",
               url: "${git_url}"]]])
     echo "Git checkout to ${git_url} is success"
}
