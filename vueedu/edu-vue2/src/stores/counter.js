// stores/counter.js
import { defineStore } from 'pinia'
import { ref, computed } from 'vue'

export const useCounterStore = defineStore('counter', () => {       //useCounterStore 애한테 들어가는게 함수
    const count = ref(0);
    const name = ref('장현수');
    const logo = '/images/pinialogo.png';
    
    const myInfo = computed(() => `이름은 ${name.value} 입니다`);
   
    function increment() {
      count.value++
    }
    return { count, name, logo, myInfo, increment }
  },
)

/*
Option API 방식의 스토아 구현
export const useCounterStore = defineStore('counter', {
  state: () => {
    return { count: 0, name: '장현수', logo: '/images/pinialogo.png' }
  },
  getters: {
    myInfo: (state) => {
      return `이름은 ${state.name} 입니다`;
    }
  },
  actions: {
    increment() {
      this.count++
    },
  },
})*/
