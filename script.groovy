def buildApp() {
    echo "building the applications..."
} 

def testApp() {
    echo "test the applications..."

} 

def deployApp() {
        echo 'Deploying....'
        echo "deploying version ${params.VERSION}"
} 

return this