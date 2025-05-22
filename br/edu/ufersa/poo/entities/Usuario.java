class Usuario {
  private String login;
  private String senha;
  private String nome;
  private String endereco;

  public String getLogin() {
        return login;
  }

  public void setLogin(String login) {
        this.login = login;
  }

  public String getSenha() {
        return senha;
  }

  public void setSenha(String senha) {
        this.senha = senha;
  }

  public String getNome() {
        return nome;
  }

  public void setNome(String nome) {
        this.nome = nome;
  }
  
  public String getEndereco() {
        return endereco;
  }

  public void setEndereco(String endereco) {
        this.endereco = endereco;
  }

  public boolean autenticarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
  }

  public void verPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Endereço: " + endereco);
  }
}
