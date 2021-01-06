<template>
  <div class="m-content">
    <h3>欢迎来到 Knight 的Blog</h3>
    <div class="block">
      <el-avatar :size="50" :src="user.avatar"></el-avatar>
      <div>{{ user.username }}</div>
    </div>

    <!-- 竖分割线 -->
    <div class="maction">
      <span><el-link href="/blogs">主页</el-link></span>

      <el-divider direction="vertical"></el-divider>

      <span><el-link type="success" href="/blog/add">发表Blog</el-link></span>

      <el-divider direction="vertical"></el-divider>

      <span v-show="!hasLogin"><el-link type="primary" href="/login">登录</el-link></span>

      <!-- 定义 logout 方法后再 退出 -->
      <span v-show="hasLogin"><el-link type="danger" @click="logout">退出</el-link></span>
    </div>

  </div>
</template>

<script>
export default {
  name: "Header",
  data() {
    return {
      user: {
        username: '请您先登录',
        avatar: 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2435093970,3292456683&fm=26&gp=0.jpg'
      },
      hasLogin: false
    }
  },

  methods: {
    logout() {
      const _this = this
      _this.$axios.get("/logout", {
        headers: {
          "Authorization": localStorage.getItem("token")
        }
      }).then(res => {
        _this.$store.commit("REMOVE_INFO")
        _this.$router.push("/login")
      })
    }
  },
  created() {
    if(this.$store.getters.getUser.username) {
      this.user.username = this.$store.getters.getUser.username
      this.user.avatar = this.$store.getters.getUser.avatar
      this.hasLogin = true
    }
  }
}
</script>

<!-- 样式 -->
<style scoped>
.m-content {
  max-width: 960px;
  margin: 0 auto;
  text-align: center;
}
.maction {
  margin: 10px 0;
}
</style>