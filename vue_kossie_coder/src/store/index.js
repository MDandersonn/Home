import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)//VueX를 사용하겠다는 의미

export default new Vuex.Store({
  state: { //데이터가들어감 data와비슷함
  },
  getters: {//뷰 컴포넌트안의 computed와 비슷함
  },
  mutations: {//데이터를 바꿔줌 (update) 
  },
  actions: {//함수가 들어감(비동기) (method)
  },
  modules: {
  }
})
