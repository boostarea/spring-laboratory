package com._2显式引用Bean首字母大小写问题;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDataService implements DataService {
    @Override
    public void deleteStudent(int id) {
        System.out.println("delete student info maintained by oracle");
    }
}
