class Usuario {
  private String login;
  private String senha;
  private String nome;
  private String endereco;
  private String email;
  
  public Usuario() {}
  
  public Usuario(String login, String senha, String nome, String endereco, String email) {
	  this.login = login;
	  this.senha = senha;
	  this.nome = nome;
	  this.endereco = endereco;
	  this.email = email;
  }
  
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
  
  public String getEmail() {
      return email;
}

public void setEmail(String email) {
      this.email = email;
}

  public boolean autenticarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
  }

  public void verPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Casa: " + email);
  }
}
