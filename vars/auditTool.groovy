def call(){
  node{
    sh ''' 
      git version
      node -v
      npm -v
      yarn -v
    '''
  }
}
