package tw.com.lccnet.web.dao;

import java.util.List;

import tw.com.lccnet.web.utils.UserSetComment;

public interface CommentDao {
	
	//新增
		public void setComment(UserSetComment uscomment );
	
	//取得	
		public List<UserSetComment> getComment(); 
}
