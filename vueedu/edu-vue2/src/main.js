import './assets/main.css'

import { createApp } from 'vue'
import "bootstrap/dist/css/bootstrap.min.css"
import App from './App.vue'              //ecme6 구문 export 시키면 중괄호 없이 대입
import router from './router'               //ecme6 구문 export 시키면 중괄호 없이 대입
import { createPinia } from 'pinia'

const pinia = createPinia()
createApp(App).use(router).use(pinia).mount('#app') //use 메서드를 