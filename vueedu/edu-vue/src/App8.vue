<script>
import UserProfile from '@/components/UserProfile8.vue';
export default {
  components: {
    UserProfile,
  },
  methods: {
    printHello(name, age) {
      alert(`안녕하세요! 저는 ${name}이고, 나이는 ${age}살입니다.`);
    },
  },
};
</script>
<template>
  <!-- 비구조화 할당으로 인자의 값을 받아 처리-->
  <UserProfile @print-hello="(name, age) => printHello(name, age)" />
</template>
