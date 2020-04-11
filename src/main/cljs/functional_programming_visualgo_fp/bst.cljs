(ns functional-programming-visualgo-fp.bst
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [functional-programming-visualgo-fp.graphviz :as graphviz]))

;; 参考D3.js的领域描述来设计你的公共函数库,你的TODO

(defn select-all-path
  "TODO: 查找特定的一些边,然后改变他们的颜色"
  [])

(defn select-all-circle
  "TODO: 查找特定的一些圆圈,然后改变他们的颜色"
  [])

(defn append-path-circle
  "TODO: 在特定的边后面,加上圆圈"
  [])

(defn append-circle-path
  "TODO: 在特定的圆圈后面,加上边"
  [])

(defn update-circle-text
  "TODO: 修改圆圈内部的text内容"
  [text text2])

(defn page []
  [:div
   [:div.bg-black.w-100 {:style {:height "3em"}}
    [:div.flex.flex-row
     [:img {:style {:width 20}
            :on-click #(.go js/history -1)
            :src "/img/back.svg"}]
     [:div.white.pa3.flex.flex-auto "二叉搜索树"]
     [:div.white.pa3 {:style {:height "3em"
                              :width "7em"}} "示例模式"]
     [:div.pl2
      [:div.bg-yellow.pa3 {:style {:height "3em"
                                   :width "4em"}} "登陆"]]]]
   [:div#graph]
   [:div.flex.flex-row.pa3
    [:div.flex.flex-auto]
    [:div
     [:button.f5.ba.bg-white
      {:on-click #(prn 1)
       :style {:border-radius "1em"
               :height "2em"
               :color "gray"
               :border "2px solid rgba(187, 187, 187, 1)"
               :width "7em"}}
      "生成随机树"]]]])
