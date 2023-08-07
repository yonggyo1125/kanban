package models.works;

import java.util.List;

public class WorkDao {

    /**
     * 작업 저장
     *
     * @param work
     *              - workNo가 있으면 수정, 없으면 추가
     * @return
     */
    public boolean save(Work work) {

        return false; // 임시 
    }

    /**
     * 삭제
     *
     * @param workNo
     * @return
     */
    public boolean delete(long workNo) {

        return false; // 임시
    }

    /**
     * 개별 조회 
     * 
     * @param workNo
     * @return
     */
    public Work get(long workNo) {

        return null;
    }

    /**
     * 목록 조회
     * @param work
     *          - status, subject, content에 따라서 검색 조건 생성
     * @return
     */
    public List<Work> gets(Work work) {

        return null;
    }
}
