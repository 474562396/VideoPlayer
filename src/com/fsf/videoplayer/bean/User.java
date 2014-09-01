package com.fsf.videoplayer.bean;

import cn.bmob.v3.BmobObject;

/**
 * �û�����ҵ����
 * @author Administrator
 *
 */
public class User extends BmobObject {
	private String username; // �û���
	private String nickname; // �ǳ�
	private String email; // ����
	private String password; // ��½����
	private String photo; // ͷ��
	private String motto; // ������
	private String profile; // �û����

	public User() {
		super();
	}

	public User(String username, String nickname, String email,
			String password, String photo, String motto, String profile) {
		super();
		this.username = username;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.photo = photo;
		this.motto = motto;
		this.profile = profile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", nickname=" + nickname
				+ ", email=" + email + ", password=" + password + ", photo="
				+ photo + ", motto=" + motto + ", profile=" + profile + "]";
	}

}
