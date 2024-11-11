<template>
  <div>
    <h2>provide와 inject(제공자)</h2>
    <h3>자손에게 전달한 데이터 : {{ count }}</h3>
    <ProvideInjectChild />
  </div>
</template>

<script setup>
import ProvideInjectChild from './ProvideInjectChild.vue';
import { provide, ref, reactive } from 'vue'

provide('pmess', '안녕?');
const count = ref(100);
provide('pnum', count);
const obj = reactive({
  name: "장현수",
  age: 20
});
provide('pobj', obj);
provide('skipm', ref('자손에게만 줄 메시지(용돈)'));
</script>