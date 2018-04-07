package com.ddy.data.vue.Server;

import java.util.List;
import java.util.Map;

public interface VoteService {
    void anonymityVoteroject(String project);

    List<Map> countAllResult();
}
