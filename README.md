# Android-UploadMultipartImage
Android 仿照微信发说说，既能实现拍照，选图库，多图案上传 使用Retrofit技术。
#使用方法：详见博客
http://blog.csdn.net/u010046908/article/details/50767904
#项目的运行效果：
![](https://github.com/lidong1665/Android-UploadMultipartImage/blob/master/image/QQ%E5%9B%BE%E7%89%8720160229164310.jpg)
![](https://github.com/lidong1665/Android-UploadMultipartImage/blob/master/image/QQ%E5%9B%BE%E7%89%8720160229164301.jpg)
![](https://github.com/lidong1665/Android-UploadMultipartImage/blob/master/image/QQ%E5%9B%BE%E7%89%8720160229164252.jpg)
#服务器端接收文件的action
UploadFile.java

@Controller
public class UploadFile extends  ActionSupport {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File[] file;//文件数组
	private String description;//说说内容
	public File[] getFile() {
		return file;
	}
	public void setFile(File[] file) {
		this.file = file;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Action("/upload")
	public void upload()  {
		System.out.println("上传的文件="+Arrays.toString(file));
		System.out.println("说说内容="+description);
	}
	
	
	
}


#服务器运行效果：
![](https://github.com/lidong1665/Android-UploadMultipartImage/blob/master/image/QQ%E5%9B%BE%E7%89%8720160229164448.png)



