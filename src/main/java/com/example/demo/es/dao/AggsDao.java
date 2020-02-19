package com.example.demo.es.dao;

import java.util.Map;


public class AggsDao {


    /**
     * 根据域名查询解析ip的数量范围
     * @param map
     * @param commonEntity
     * @return
     */
    /*public SearchHits searchParasIpCount(Map map, CommonEntity commonEntity, SearchSourceBuilder searchSourceBuilder){
        SearchResponse searchResponse;
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        if (!commonEntity.getStartDate().equals("")||!commonEntity.getEndDate().equals("")){
            boolQueryBuilder.must(QueryBuilders.rangeQuery("dt")
                    .from(commonEntity.getStartDate()).to(commonEntity.getEndDate()));
        }


        if (map.get("res_num")!=null){
            log.info("域名查询解析ip的数量 res_num = "+map.get("res_num"));
            int res_num = map.get("res_num") == "" ? 0 : Integer.valueOf(String.valueOf(map.get("res_num")));
            if (res_num==0){
                log.warn("res_num请求参数为0或者为空");
            }else {
                boolQueryBuilder.must(QueryBuilders.rangeQuery("res_num").from(res_num));
            }
        }
        if (map.get("domain")!=null){
            boolQueryBuilder.must(QueryBuilders.wildcardQuery("domain"+Keyword,"*"+map.get("domain")+"*"));
        }
        TermsAggregationBuilder termsAggregationBuilder =  AggregationBuilders.terms("resipAgg").field("resip"+Keyword);
        TermsAggregationBuilder termsAggregationBuilder1 =  AggregationBuilders.terms("dnsAgg").field("domain"+Keyword);
        searchSourceBuilder.query(boolQueryBuilder);
        searchSourceBuilder.aggregation(termsAggregationBuilder1.subAggregation(termsAggregationBuilder));
        searchSourceBuilder.aggregation(termsAggregationBuilder);
        searchSourceBuilder.sort(new FieldSortBuilder("dt").order(SortOrder.DESC));
        searchSourceBuilder.sort(new FieldSortBuilder("res_num").order(SortOrder.DESC));
        searchResponse = client.prepareSearch(constant.getIndex_Ripnum_ES())
                .setTypes(Type_Ripnum_ES)
                .setSource(searchSourceBuilder)
                .get();
        Terms genders =  searchResponse.getAggregations().get("dnsAgg");
        for (Terms.Bucket entry : genders.getBuckets()) {
            Object key =  entry.getKey();    // Key
            String keyAsString = entry.getKeyAsString(); // Key as String
            long docCount = entry.getDocCount();         // Doc count
            System.out.println(key);
            System.out.println(entry.getDocCount());
            System.out.println(entry.getKeyAsString());
            log.info("key [{}], date [{}], doc_count [{}]", keyAsString,  docCount);
            System.out.println("-----------------------------");
            Terms genders1 =  entry.getAggregations().get("resipAgg");
            int total = genders1.getBuckets().size();
            System.out.println("数量："+total);
            for (Terms.Bucket entry1 : genders1.getBuckets()) {
                String keyAsString1 = entry1.getKeyAsString(); // Key as String
                long docCount1 = entry1.getDocCount();         // Doc count
                System.out.println(entry1.getDocCount());
                System.out.println(entry1.getKeyAsString());
                log.info("key [{}], date [{}], doc_count [{}]", keyAsString1,  docCount1);
                System.out.println(entry1.getAggregations().get("resipAgg"));
            }

        }*/

    }
