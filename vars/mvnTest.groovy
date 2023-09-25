def call(){
  sh 'mvn compile'
  sh 'mvn test'
}
