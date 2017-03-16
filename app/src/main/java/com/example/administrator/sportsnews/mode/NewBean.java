package com.example.administrator.sportsnews.mode;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */

public class NewBean {

    /**
     * showapi_res_body : {"code":200,"msg":"success","newslist":[{"ctime":"2017-02-26 18:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/5B19542BA8682277E9EC6C5065E1C0487004E79B_size1263_w1320_h924.png","title":"中国队遭日本韩国羞辱！三战0-32惨败 隐情惊人！球员没工资","url":"http://sports.ifeng.com/a/20170226/50733975_0.shtml"},{"ctime":"2017-02-26 18:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/92278F04943561DA1F1BC8FB68C7C96DDF166C10_size17_w570_h379.jpeg","title":"赖亚文走后有人提议女排请外教，被郎平一句话彻底否决","url":"http://sports.ifeng.com/a/20170226/50733976_0.shtml"},{"ctime":"2017-02-26 01:32","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/055896F736159953EEF43CE289D80B01CBDAB946_size1245_w1320_h924.png","title":"尘埃落定！李永波东京奥运周期继续执掌国家羽毛球队","url":"http://sports.ifeng.com/a/20170226/50733977_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/003B42575AEA921A3C0A47B62F62F8C48FC1FB15_size328_w534_h273.gif","title":"怒了！恒大新星防守失误 69岁斯帅终于忍无可忍！","url":"http://sports.ifeng.com/a/20170226/50733493_0.shtml"},{"ctime":"2017-02-26 00:08","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/D59F0BDE4E4E8EA4D1B80144114414B9432E88C7_size1190_w1320_h924.png","title":"他21岁就当上枪手队长 如今已成英超赛场的西班牙第一人","url":"http://sports.ifeng.com/a/20170226/50733494_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/F5DF2ED807F0A0D7537C779AFA85A7596CAEDDC5_size65_w640_h366.jpeg","title":"搭档冯潇霆防住苏宁两大锋霸，改踢中卫或可再迎巅峰","url":"http://sports.ifeng.com/a/20170226/50733501_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/4081602BED1AF7CFB0967619AB26315C68F4E95B_size1303_w1320_h924.png","title":"CBA山东功勋外援：八一如果有外援就是CBA前三的球队","url":"http://sports.ifeng.com/a/20170226/50733502_0.shtml"},{"ctime":"2017-02-25 19:19","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0225/ED149BDD224293FAA3D1C0F2D13E55FAD8026828_size34_w700_h427.jpeg","title":"输不起? 林志杰输球踢坏辽宁更衣室的门被记者怒批!","url":"http://sports.ifeng.com/a/20170226/50733503_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/348E75E4F28E15710711B78A43AD998372F2CA76_size1109_w1320_h924.png","title":"明知道中国男篮这浑水不好趟, 但姚明为什么还是想去试一试?","url":"http://sports.ifeng.com/a/20170226/50733504_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/5198BB3E93A44FE783F23E4E956C8C37B6E0083B_size42_w641_h427.jpeg","title":"坑爹裁判刻意压分，最美一姐憾失金牌，她凭啥夺冠，金妍儿效应！","url":"http://sports.ifeng.com/a/20170226/50733505_0.shtml"}]}
     * showapi_res_code : 0
     * showapi_res_error :
     */

    private ShowapiResBodyBean showapi_res_body;
    private int showapi_res_code;
    private String showapi_res_error;

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public static class ShowapiResBodyBean {
        /**
         * code : 200
         * msg : success
         * newslist : [{"ctime":"2017-02-26 18:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/5B19542BA8682277E9EC6C5065E1C0487004E79B_size1263_w1320_h924.png","title":"中国队遭日本韩国羞辱！三战0-32惨败 隐情惊人！球员没工资","url":"http://sports.ifeng.com/a/20170226/50733975_0.shtml"},{"ctime":"2017-02-26 18:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/92278F04943561DA1F1BC8FB68C7C96DDF166C10_size17_w570_h379.jpeg","title":"赖亚文走后有人提议女排请外教，被郎平一句话彻底否决","url":"http://sports.ifeng.com/a/20170226/50733976_0.shtml"},{"ctime":"2017-02-26 01:32","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/055896F736159953EEF43CE289D80B01CBDAB946_size1245_w1320_h924.png","title":"尘埃落定！李永波东京奥运周期继续执掌国家羽毛球队","url":"http://sports.ifeng.com/a/20170226/50733977_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/003B42575AEA921A3C0A47B62F62F8C48FC1FB15_size328_w534_h273.gif","title":"怒了！恒大新星防守失误 69岁斯帅终于忍无可忍！","url":"http://sports.ifeng.com/a/20170226/50733493_0.shtml"},{"ctime":"2017-02-26 00:08","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/D59F0BDE4E4E8EA4D1B80144114414B9432E88C7_size1190_w1320_h924.png","title":"他21岁就当上枪手队长 如今已成英超赛场的西班牙第一人","url":"http://sports.ifeng.com/a/20170226/50733494_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/F5DF2ED807F0A0D7537C779AFA85A7596CAEDDC5_size65_w640_h366.jpeg","title":"搭档冯潇霆防住苏宁两大锋霸，改踢中卫或可再迎巅峰","url":"http://sports.ifeng.com/a/20170226/50733501_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/4081602BED1AF7CFB0967619AB26315C68F4E95B_size1303_w1320_h924.png","title":"CBA山东功勋外援：八一如果有外援就是CBA前三的球队","url":"http://sports.ifeng.com/a/20170226/50733502_0.shtml"},{"ctime":"2017-02-25 19:19","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0225/ED149BDD224293FAA3D1C0F2D13E55FAD8026828_size34_w700_h427.jpeg","title":"输不起? 林志杰输球踢坏辽宁更衣室的门被记者怒批!","url":"http://sports.ifeng.com/a/20170226/50733503_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/348E75E4F28E15710711B78A43AD998372F2CA76_size1109_w1320_h924.png","title":"明知道中国男篮这浑水不好趟, 但姚明为什么还是想去试一试?","url":"http://sports.ifeng.com/a/20170226/50733504_0.shtml"},{"ctime":"2017-02-26 10:00","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/5198BB3E93A44FE783F23E4E956C8C37B6E0083B_size42_w641_h427.jpeg","title":"坑爹裁判刻意压分，最美一姐憾失金牌，她凭啥夺冠，金妍儿效应！","url":"http://sports.ifeng.com/a/20170226/50733505_0.shtml"}]
         */

        private int code;
        private String msg;
        private List<NewslistBean> newslist;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            /**
             * ctime : 2017-02-26 18:00
             * description : 凤凰体育
             * picUrl : http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0226/5B19542BA8682277E9EC6C5065E1C0487004E79B_size1263_w1320_h924.png
             * title : 中国队遭日本韩国羞辱！三战0-32惨败 隐情惊人！球员没工资
             * url : http://sports.ifeng.com/a/20170226/50733975_0.shtml
             */

            private String ctime;
            private String description;
            private String picUrl;
            private String title;
            private String url;

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
