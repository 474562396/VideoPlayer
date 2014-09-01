package com.fsf.videoplayer.bean;

import cn.bmob.v3.BmobObject;

/**
 * 评论对象业务类
 * @author Administrator
 *
 */
public class Comment extends BmobObject {
	private int voide_id; // 视频ID
	private User user; // 评论者
	private String content; // 评论内容

	public Comment(int voide_id, User user, String content) {
		super();
		this.voide_id = voide_id;
		this.user = user;
		this.content = content;
	}

	public Comment() {
		super();
	}

	public int getVoide_id() {
		return voide_id;
	}

	public void setVoide_id(int voide_id) {
		this.voide_id = voide_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "comment [voide_id=" + voide_id + ", user=" + user
				+ ", content=" + content + "]";
	}

}
