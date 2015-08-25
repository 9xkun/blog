package com.n9xkun.iziroi.databinding.pojo;

/**
 * Entity kiểu POJO cơ bản
 */
public class User {
  private final String firstName;

  public User(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }
}
