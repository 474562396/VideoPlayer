package com.fsf.videoplayer.bean;

import cn.bmob.v3.BmobObject;

/**
 * ��Ƶ����ҵ����
 * @author Administrator
 *
 */
public class Video extends BmobObject {
	private String url;	//��ƵURL
	private String videoName;	//��Ƶ����
	private String videoProfile;	//��Ƶ���
	private String image;	//��Ƶ����
	private String time;	//����ʱ��

	public Video(String url, String videoName, String videoProfile,
			String image, String time) {
		super();
		this.url = url;
		this.videoName = videoName;
		this.videoProfile = videoProfile;
		this.image = image;
		this.time = time;
	}

	public Video() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoProfile() {
		return videoProfile;
	}

	public void setVideoProfile(String videoProfile) {
		this.videoProfile = videoProfile;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Video [url=" + url + ", videoName=" + videoName
				+ ", videoProfile=" + videoProfile + ", image=" + image
				+ ", time=" + time + "]";
	}

}
