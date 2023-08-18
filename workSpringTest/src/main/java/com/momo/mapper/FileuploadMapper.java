package com.momo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.momo.vo.FileuploadVO;

public interface FileuploadMapper {

	/**
	 * 하나의 게시물에 대해 업로드된 파일 목록을 조회
	 * @param bno
	 * @return
	 */
	public List<FileuploadVO> getList(int bno);
	
	public int insert(FileuploadVO vo);
	
	public int delete(@Param("bno") int bno, @Param("uuid") String uuid); // 두개를 선언할 때는 @Param 선언
	
	public FileuploadVO getOne(@Param("bno") int bno, @Param("uuid") String uuid);
	
}
