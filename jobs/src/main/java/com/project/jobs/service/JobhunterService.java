package com.project.jobs.service;

import java.util.List;
import java.util.Map;

import com.project.jobs.domain.JobhunterVO;

public interface JobhunterService {
	
	int getTotalCount();
	
	/** 게시글 작성*/
	int insertJobhunter(JobhunterVO jobhunter);
	
	/** 모든 인재정보 가져오기*/
	List<JobhunterVO> listJobhunter();
	
	/** 모든 인재정보 가져오기*/
	List<JobhunterVO> listJobhunter(Map<String,String> map);
	
	/**총 게시글 수 가져오기*/
	public int getTotalCount(Map<String,String> map);

	/** 해당하는 idx의 정보 가져오기*/
	JobhunterVO getJobhunter(int idx);
	
	/**게시판번호로 특정 채용정보 가져오기*/
	public JobhunterVO selectByNum(Integer num);
	
	/** 게시판 번호로 조회수 늘리기*/
	public boolean updateReadnum(Integer num);
	
	/** 조회수 top5 게시글만 띄우기*/
	List<JobhunterVO> selectJobhunterTop5();
	
	/** 최근 등록된 6개의 게시글만 띄우기*/
	List<JobhunterVO> selectJobhunterlatest();
	
	/** 카테고리에 맞게 게시글 띄우기*/
	List<JobhunterVO> selectCategory(String colname, String category);
	
	/** 각 분야별 카운트*/
	List<JobhunterVO> selectCount();
	
	/** 글 삭제*/
	int deleteJobhunter(int num);//삭제
	
	/** 수정 (파일을 수정했을때)*/
	int updateJobhunterF(JobhunterVO jobhunter);
	
	/** 수정 (파일을 수정안했을때)*/
	int updateJobhunter(JobhunterVO jobhunter);
	
	/** 본인이 작성한 글*/
	List<JobhunterVO> listJobhunterMe(String userid);
}
